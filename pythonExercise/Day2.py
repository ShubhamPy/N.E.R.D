#################################################################################
#                           DAY-2                                               #
#################################################################################
#                  Wrapping up  python3.x fundamentals-2                        #
#################################################################################
#              cover(modules, classes, file, work with json)                    #
#################################################################################

#Modules

import datetime
today_date=datetime.date.today()
print(today_date)

from datetime import date
date_today=date.today()
print(date_today)

import time
time_now=time.time()
print(time_now)

from time import time
now_time=time()
print(now_time)

#pip modules
import camelcase
camel=camelcase.CamelCase()
text="Hello folks this is day-2"
print(camel.hump(text))

#Classes

class User:
    def __init__(self,name,age,email):
        self.name=name
        self.age=age
        self.email=email

    def Greetings(self):
        return(f'I am {self.name} and i am {self.age} and my mail id is {self.email}')

shubhampy = User('Shubham Garg',19,'shubham@gmail.com')
mehra1998 = User('Sahil Mehra',24,'sahil@gmial.com')
print(shubhampy.age,mehra1998.age)
print(shubhampy.Greetings())

#files

myfile=open('myfile.txt','w')
myfile.write('Its going to be great')
myfile.write(' and full of knowledge ')
myfile.close()
print(myfile.name)
print(myfile.mode)
print(myfile.closed)

myfile=open('myfile.txt','a')        #a- append w-here will overwrite the previous content of file
myfile.write('also with lot of fun')
myfile.close()

myfile=open('myfile.txt','r+')           #read mode
read=myfile.read(50)
print(read)

#working with json

#JSON is commomly with used datat APIs. Here how we can parse JSON in python dictionary
#-don't save sample file with name json.py as it already existing file in python module yet hows the error
import json
json_sample = '{"first_name":"shubham","last_name":"garg","Email":"shubham@gmail.com"}'

sample=json.loads(json_sample)       #parse json to py dict
print(sample)

dict={'first_name':'silly','last_name':'potato','age':19}
print(dict)
sampl=json.dumps(dict)               #dictionary to json
print(sampl)