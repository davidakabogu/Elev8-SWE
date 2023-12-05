# for i in range(0, 11, 2):
#     print("current value is", i)

# power = 1
# for expo in range(16):
#     print("2 to the power of", expo, "is", power)
#     power *= 2

# for i in range(1, 6):
#     if i == 3:
#         break
#     print("The inside loop is", i)
# print('outside the loop')

# for i in range(1, 6):
#     if i == 3:
#         continue
#     print("this is the loop", i)
# print("loop done")

# secret_word = "chupacabra"
# while True:
#     word = input("Enter the secret word to exit the loop: ")
#     if word == secret_word:
#         print("you've successfully exited the loop")
#         break

# def pyramid_height(blocks):
#     height = 0
#     blocks_used = 0
#     while blocks_used + (height + 1) <= blocks:
#         height += 1
#         blocks_used += height
#     return height
# # Get the number of blocks from the user
# blocks_input = input("Enter the number of blocks: ")
# # Validate the input
# try:
#     blocks = int(blocks_input)
#     if blocks < 0:
#         raise ValueError("Number of blocks should be a non-negative integer.")
# except ValueError as e:
#     print(f"Error: {e}")
# else:
#     # Calculate and print the pyramid height
#     result = pyramid_height(blocks)
#     print(f"The height of the pyramid is: {result}")

# list_here = [1, 2, 3, 4, 5]
# list_here.append(2) # add to end of array
# print(sorted(list_here)) # sort array
# list_here.pop() # remove last index from array
# print(len(list_here)) # length of list
# print(list_here[2:4]) # python slicing
# list_here.insert(2, 10)
# print(list_here)


# def is_prime(num):
#     if num <= 1:
#         return False
#     for i in range(2, int(num**0.5) + 1):
#         if num % i == 0:
#             return False
#     return True
# for i in range(1, 20):
#     if is_prime(i + 1):
#         print(i + 1, end=" ")
# print()

# my_list = [i for i in range(-1, 2)]
# print(my_list)

# tup = (1, 2, 3, 4)
# tup = tup[1:-1]
# tup = tup[0]
# print(tup)

# dictionary = {}
# my_list = ['a', 'b', 'c', 'd']
# for i in range(len(my_list) -1):
#     dictionary[i] = (my_list[i], )
# for i in sorted(dictionary.keys()):
#     k = dictionary[i]
#     print(k)

# print(Hello, World!)

# nums = [1, 2, 3]
# vals = nums
# del vals[:]
# print(nums, vals)

# try:
#     print(5/0)
#     break
# except:
#     print("sorry")
# except(ValueError, ZeroDivisionError) :
#     print("too")

# foo = (1, 2, 3)
# foo = foo[-1]
# print(foo)
# foo.index(1) # returns the index in which the value searched for is found
# print(foo.index(2))

# arr = [[x for x in range(3)] for y in range(3)]
# print(arr)

# my_list = [1, 2]
# for v in range(2):
#     my_list.insert(-1, my_list[v])
# print(my_list)m

# my_list = [0, 1, 4, 9, 16] #[0,1,4,9]

# def fun(lst):
#     del lst[4]

# lst = [i for i in range(-1, 2)]
# print(lst)

# dct ={'one':'two', 'three':'one', 'two':'three'}
# v = dct['three']
# # print(v) # value of v is 'one'
# for k in range(len(dct)):
#     # print(v)
#     v = dct[v]
# print(v)

# lst = [[x for x in range(3)] for y in range(3)]
# print(lst)
# for r in range(3):
#     for c in range(3):
#         print(r, c)
#         # if lst[r][c] % 2 != 0:
#         #     print("#")

# a = 1
# b = 0
# a = a ^ b
# print(a)
# b = a ^ b
# print(b)
# a = a ^ b
# print(a, b)

# tup = (1, ) + (1, )
# tup = tup + tup
# print(tup)

# from platform import system, version, machine
# print(system())
# print(type(version()))
# print(machine())

# from random import randint
# for i in range(2):
#     print(randint(1, 2), end='')

# print(chr(ord('z') - 2))


# class Chibuikem:
#     def __init__(self):
#         pass

#     def display_things_about_chibuikem(self):
#         self.Likes = [
#             "God",
#             "motorcycles",
#             "gaming",
#             "gold",
#         ]
#         self.Gadgets = [
#             "22 Macbook Pro",
#             "12 Pro max",
#             "15 Macbook Air",
#             "Sony speakers",
#             "PS5",
#             "PS4",
#         ]
#         print(f"I like {self.Likes}")
#         print(f"I use {self.Gadgets}")


# instace_of_chibuikem = Chibuikem()
# print(instace_of_chibuikem.Gadgets)
# print(instace_of_chibuikem.Likes)


# def fun(n):
#     s = " "
#     for i in range(n):
#         s += "*"
#         yield s
# for x in fun(3):
#     print(x, end='')

# x = """
# """
# print(len(x))

# def fun(d, k, v):
#     d[k] = v
# my_dictionary = {}
# print(fun(my_dictionary, '1', 'v'))

# my_string = 'abcdef'
# def fun(s):
#     # del s[2]
#    return s[2]
# print(fun(my_string))

# d = {}
# d["2"] = [1, 2]
# d["1"] = [3, 4]
# print(d)
# for x in d.keys():
#     print(d[x][1], end="")

# class A:
#      def __init__(self):
#          pass
#      def f(self):
#          return 1
#      def g(): # always call self. to take a positional argument
#          return self.f()
# a = A()
# print(a.g())

# str_1 = 'string'
# str_2 = str_1[:]
# print(str_1[:])
# print(str_1, str_2)

# class A:
#     def __init__(self,name):
#          self.name = name
#     # def __str__(self):
#     #     return self.name
# a = A("class")
# print(a)

# s = 'abcdef'
# print(s[::2])

# print(bytearray(3))

# class A:
#     def __init__(self,v):
#         self.__a = v + 1
# instace_of_a = A(0)
# print(instace_of_a.__a)

# import os

# print(os.listdir())

# import calendar

# print(calendar.weekheader(2))

# print("\\\\")

# num = [i * i for i in range(5)]
# print(num)
# foo = list(filter(lambda x: x % 2, num)) # the expression can take == 1, == True or just left as is
# print(foo)  # output [1,9]

# print(float("1.3"))


# def fun(x):
#     return 1 if x % 2 != 0 else 2


# print(fun(fun(1)))
