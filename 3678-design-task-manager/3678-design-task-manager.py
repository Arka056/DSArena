from sortedcontainers import SortedList

class TaskManager:
    def __init__(self, tasks: list[list[int]]):
        self.task_info = {}
        self.sorted_tasks = SortedList(key=lambda x: (-x[0], -x[1]))

        for userId, taskId, priority in tasks:
            self.task_info[taskId] = (userId, priority)
            self.sorted_tasks.add((priority, taskId))

    def add(self, userId: int, taskId: int, priority: int) -> None:
        self.task_info[taskId] = (userId, priority)
        self.sorted_tasks.add((priority, taskId))

    def edit(self, taskId: int, newPriority: int) -> None:
        userId, oldPriority = self.task_info[taskId]
        self.sorted_tasks.remove((oldPriority, taskId))
        self.task_info[taskId] = (userId, newPriority)
        self.sorted_tasks.add((newPriority, taskId))

    def rmv(self, taskId: int) -> None:
        userId, priority = self.task_info[taskId]
        self.sorted_tasks.remove((priority, taskId))
        del self.task_info[taskId]

    def execTop(self) -> int:
        if not self.sorted_tasks:
            return -1
        priority, taskId = self.sorted_tasks[0] 
        self.sorted_tasks.remove((priority, taskId))
        userId, _ = self.task_info.pop(taskId)
        return userId
