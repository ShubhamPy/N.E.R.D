###############################################################################################
#                                      DAY-1                                                  #
###############################################################################################
#                           Wrapping up python3.x basics                                      #
###############################################################################################

# Multipe Assignments
a,b,c,d=(1,2.5,'nerd',True) #int,float,string,bool
print(a,b,c,d)

# Type casting
a=str(a)
b=int(b)
print(type(a),type(b))
print(b)

# Concatenate
name,code = ("shubham","python basics")
print("Hello all I am "+ name +" and this is " + code)

# String Formatting
#Arguments by positions
print('{},{},{}'.format('a','b','c'))
print('{2},{1},{0}'.format('a','b','c'))

#Arguments by name
print('My Name is {name} and this is code for {code}'.format(name=name,code=code))

#F-stings
print(f'My name is {name} and this code is for {code}')

#String Methods
'''
.capatalize()
.upper()
.lower()
.swapcase
len()
.replace()  #give arguments to replace
.count()
.find()
.startswith()
.endswith()
.split()
.isalnum()
.isalpha()
.isnumeric
'''

#Lists -mutable -changeable -duplicacy allowed

num=[1,2,3,4,5]
print(num)
print(list((6,7,8,9,10)))    #using constructor
num.append(0)
num.remove(5)
print(num)
num.sort()
print(num)
num.insert(3,10)
num.pop(1)
print(num)
num.reverse()

#Tuples -immutable -unchangeable

tup=(1,2,3,4,5)
tup1=tuple((5,6,7,8,9,0))     #using constructors
print(tup)

#set -unindexed -no duplicacy allowed
set1= {1,2,3,4,5}
print(2 in set1)    #check if in set

'''
.add()
.remove()
.clear()
'''

#Dictionary -mutable

dict1={'alpha':20,'beta':27,'gamma':45}
print(dict1)
dictc = dict(a=20,b=27,c=45)
print(dictc)
dict1['delta']='90'
print(dict1)
dict2=dict1.copy()     #make copy of another dict
print(dict2)

del dict2['beta']       #remove specefic
#.pop()          #remove acc to indexed
print(dict2)

#Functions

#A function is a block of code which only runs when its called.In python we don't usse any brackets or parenthesis, but we use identation
def sayhello():
    x='hello '
    y='potato'
    z=x+y
    print(z)
sayhello()

def sayHello(name):
    print('Hello ' + name)
sayHello('alpha')