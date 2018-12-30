#- Program to check if a string contains any special character

import re

any_string = 'hurray! @we are % here  on day7$ *xd'

checker= re.findall('[^\w\s]',any_string)         #special char. @_!#$%^&*()<>?/\|}{~:]
if checker:
    print('String are contains special character like {}'.format(checker))
else:
    print('not any special character')
