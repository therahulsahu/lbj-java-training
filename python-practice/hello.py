first_name = 'Rahul'
last_name = 'Sahu'
full_name = f"{first_name} {last_name}"
print(full_name)

names = ['rahul', 'rohan', 'nitesh']
last_name = names[-1]
print(last_name) #nitesh
for name in names:
    print(name)

names = []
names.append('ashish')
names.append('ankita')
names.append('manish')

for name in names:
    print(name)

squares = []
for x in range(1, 11):
    squares.append(x**2)
print(squares)

squares = [x**2 for x in range(1,11)]
print(squares)

finishers = ['sam', 'bob', 'ada', 'bea']
first_two = finishers[:2]
print(first_two)

# copying a list
copy_of_finishers = finishers[:]

# Tuples
dim = (1920, 1080)

finishers = ['sam', 'bob', 'ada', 'bea']
print('bob' in finishers)

# Dictionaries
car = {
    'color': 'red',
    'doors': 4
}
car['x_position'] = 12
print(car['x_position'])

fav_numbers = {'eric': 17, 'ever': 4}

for name, number in fav_numbers.items():
    print(name, number)

for name in fav_numbers.keys():
    print(name)

for number in fav_numbers.values():
    print(number)

# USER_INPUT
name = input('Whats your name ?')
print(name)
age = int(input('whats your age ?'))
print("In 10 years you will be : ", age+10)

# while loop

current_value = 1
while current_value <= 5:
    print(current_value)
    current_value += 1

msg = ''
while msg != 'quit':
    msg = input('whats your message ?')
    print(msg)

text = """ hello this is also a string """
print(text)

# FUNCTION

def greet_user(username):
    print(f"hello, {username}")

greet_user('rahul')

def add_number(x, y):
    return x + y

print(add_number(4,1))