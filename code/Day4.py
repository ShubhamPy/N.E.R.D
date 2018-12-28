####################################################################################
#                                   Day-4                                          #
####################################################################################
#                         Regular Expressions(Regex)                               #
####################################################################################

import re

phone= "9876543210 #this is example phone number"
print(phone)

#delete python style comment

subsitute=re.sub(r'\D','',phone)     #delete all except numbers
print(subsitute)

phoneEx="480-1234-9790 #this is example2 phone number"
#above string contains diff. no. style and also no. in commments
num1=re.sub(r'\D','',phoneEx)   #so this method fails here
print(num1)

num=re.sub(r'#.*$','',phoneEx)
print(num)

matcho=re.match('hello','hellohihey')  #match the pattern at the begining of string & returns match object else none
print(matcho)

matcherobj=re.search('hello','hey, hello i am potato') #match the pattern from whole string & returns match object else none
print(matcherobj)

findaslist = re.findall('alpha men','this men is a alpha men')
print(findaslist)

splitfunc = re.split('-','code-lobby')
splitfunc2=re.split('[.]','abc@mail.com')
print(splitfunc)
print(splitfunc2)
