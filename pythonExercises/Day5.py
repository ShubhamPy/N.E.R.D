####################################################################################
#                                   Day-5                                          #
####################################################################################
#                         Regular Expressions(Regex)                               #
####################################################################################

import re

#fullmatch - define any regex as pattern to play/restricts with input strings
anystring=input('Enter any string')
findfullmatch = re.fullmatch('ab',anystring)
if findfullmatch:
    print('yes')
else:
    print("no")


#regex to validates mobile number
x=input('enter mobile no')
findfullmatch2 = re.fullmatch('[7-9]\d{9}',x)
if findfullmatch2:
    print('confirmed')
else:
    print("invalid no")
#regex to validates identifiers
y=input('enter identifier')          #identifier are those which repersents variable, keywords that begins with underscore or any alphabet
findfullmatch3 = re.fullmatch('[a-zA-Z_]+\w*',y)   
if findfullmatch3:
    print('confirmed')
else:
    print("invalid identifier")

  #extract words
any_quote= "How you look at it is pretty much how you'll see it!"
extract1=re.findall('[yY]\w*',any_quote)
print(extract1)

extract2=re.findall('[yY]\S*',any_quote)       #extract whole word begins with y or Y.
print(extract2)
