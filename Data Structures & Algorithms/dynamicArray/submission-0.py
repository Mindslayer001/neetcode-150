class DynamicArray:
    
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.arr = [-1] * capacity
        self.length = 0

    def get(self, i: int) -> int:
        if i < 0 or i >= self.length:
            return "null"
        return self.arr[i]

    def set(self, i: int, n: int) -> None:
        if i < 0 or i >= self.capacity:
            raise IndexError("Index out of bounds")
        self.arr[i] = n

    def pushback(self, n: int) -> None:
        if self.length == self.capacity:
            self.resize()
        self.arr[self.length] = n
        self.length += 1

    def popback(self) -> int:
        if self.length == 0:
            return "null"
        self.length -= 1
        return self.arr[self.length]

    def resize(self) -> None:
        self.capacity *= 2
        new_arr = [-1] * self.capacity 
        
        for i in range(self.length):
            new_arr[i] = self.arr[i]
        self.arr = new_arr

    def getSize(self) -> int:
        return self.length
    
    def getCapacity(self) -> int:
        return self.capacity
