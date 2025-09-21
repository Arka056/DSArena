from sortedcontainers import SortedList
from collections import defaultdict

class MovieRentingSystem:

    def __init__(self, n: int, entries: List[List[int]]):
        self.unrented = defaultdict(SortedList)
        self.price_map = {}
        self.rented = SortedList()
        for shop, movie, price in entries:
            self.unrented[movie].add((price, shop))
            self.price_map[(shop, movie)] = price

    def search(self, movie: int) -> List[int]:
        lst = self.unrented[movie]
        res = []
        for i in range(min(5, len(lst))):
            price, shop = lst[i]
            res.append(shop)
        return res

    def rent(self, shop: int, movie: int) -> None:
        p = self.price_map[(shop, movie)]
        self.unrented[movie].remove((p, shop))
        self.rented.add((p, shop, movie))

    def drop(self, shop: int, movie: int) -> None:
        p = self.price_map[(shop, movie)]
        self.rented.remove((p, shop, movie))
        self.unrented[movie].add((p, shop))

    def report(self) -> List[List[int]]:
        res = []
        for i in range(min(5, len(self.rented))):
            p, shop, movie = self.rented[i]
            res.append([shop, movie])
        return res
        


# Your MovieRentingSystem object will be instantiated and called as such:
# obj = MovieRentingSystem(n, entries)
# param_1 = obj.search(movie)
# obj.rent(shop,movie)
# obj.drop(shop,movie)
# param_4 = obj.report()