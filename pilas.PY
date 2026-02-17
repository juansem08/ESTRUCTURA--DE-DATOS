# ==========================================================
# Title: Video Game Action History using Stack
# Description: This program demonstrates stack operations
#              (Push, Pop, Top, IsEmpty) in a video game.
# Language: Python
# ==========================================================


# Stack class definition
class Stack:

    # Constructor: initialize empty stack
    def __init__(self):
        self.stack = []

    # Push operation (append)
    def push(self, action):
        self.stack.append(action)
        print("Push:", action)

    # Pop operation (pop)
    def pop(self):
        if len(self.stack) == 0:  # IsEmpty
            print("Pop: Stack is empty")
        else:
            removed = self.stack.pop()
            print("Pop:", removed)

    # Top operation (-1)
    def top(self):
        if len(self.stack) == 0:
            print("Top: Stack is empty")
        else:
            print("Top:", self.stack[-1])

    # IsEmpty operation (len)
    def is_empty(self):
        if len(self.stack) == 0:
            print("IsEmpty: True")
        else:
            print("IsEmpty: False")

    # Display stack
    def display(self):
        print("Stack:", self.stack)


# ==========================================================
# Main function
# ==========================================================

def main():

    print("=== VIDEO GAME ACTION HISTORY USING STACK ===")

    # Create stack object
    game_stack = Stack()

    # Push actions
    game_stack.push("Walk")
    game_stack.push("Jump")
    game_stack.push("Shoot")

    # Display stack
    game_stack.display()

    # Top
    game_stack.top()

    # Pop
    game_stack.pop()

    # Display stack again
    game_stack.display()

    # IsEmpty
    game_stack.is_empty()


# ==========================================================
# Execute main
# ==========================================================

if __name__ == "__main__":
    main()
