import bisect
from collections import deque, defaultdict
from typing import List
class Router:
    def __init__(self, memoryLimit: int):
        self.queue = deque()
        self.dest_ts = defaultdict(list)
        self.processed = defaultdict(int)
        self.memoryLimit = memoryLimit
        self.unique = set()

    def addPacket(self, source: int, destination: int, timestamp: int) -> bool:
        packet = (source, destination, timestamp)
        if packet in self.unique:
            return False
        if len(self.queue) == self.memoryLimit:
            self.forwardPacket()
        self.queue.append(packet)
        self.unique.add(packet)
        self.dest_ts[destination].append(timestamp)
        return True

    def forwardPacket(self) -> List[int]:
        if not self.queue:
            return []
        src, dest, ts = self.queue.popleft()
        self.unique.remove((src, dest, ts))
        self.processed[dest] += 1
        return [src, dest, ts]

    def getCount(self, destination: int, startTime: int, endTime: int) -> int:
        if destination not in self.dest_ts:
            return 0
        timestamps = self.dest_ts[destination]
        start_idx = self.processed[destination]
        left = bisect.bisect_left(timestamps, startTime, lo = start_idx)
        right = bisect.bisect_right(timestamps, endTime, lo = start_idx)
        return right - left

# Your Router object will be instantiated and called as such:
# obj = Router(memoryLimit)
# param_1 = obj.addPacket(source,destination,timestamp)
# param_2 = obj.forwardPacket()
# param_3 = obj.getCount(destination,startTime,endTime)