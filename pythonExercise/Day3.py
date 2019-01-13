####################################################################################
#                                   Day-3                                          #
####################################################################################
#                         Regular Expressions(Regex)                               #
####################################################################################


# Match, protocol_patterns, or repersents a group of strings or particular structure.
import re
any_pattern = re.compile("fun")
matcher = any_pattern.finditer("regex is fun")
matcher1=re.finditer('fffff4','ffbcff')

for matcher_object in matcher:
    print("match at {} ,End at {},pattern found {}".format(matcher_object.start(),matcher_object.end(),matcher_object.group()))
matcher1=re.finditer('ff','ffbcff')

for i in matcher1:
    print("Match starts at {},Ends with {},pattern found {}".format(i.start(),i.end(),i.group()))


#metacharacters
matcher2=re.finditer('[xyz]','sxd y cfvgbhnjklzxsay ')    #found  xyz individually
for _ in matcher2:
    print("match at {} ,End at {},pattern found {}".format(_.start(),_.end(),_.group()))


matcher3=re.finditer('[0-9]','sxd y cfvbh151 njklz xs72ay ')            # [0-9] equivalent '\d' anyone should be used
for p in matcher3:
    print("match at {} ,End at {},pattern found {}".format(p.start(),p.end(),p.group()))

matcher4=re.finditer('[a-z0-9A-Z]','sxd y cfvgbh151 njklz xs72aY ')
count=0
for q in matcher4:
    count = count + 1
    print("match at {} ,End at {},pattern found {}".format(q.start(),q.end(),q.group()))
print(count)

matcher5 = re.finditer('[^0-9]','sxd y cfvbh151 njklz xs72ay ')     # (^ carrot symbol- type of complement)([^0-9] equivalent '\D' anyone should be used)
for r in matcher5:
    print("match at {} ,End at {},pattern found {}".format(r.start(),r.end(),r.group()))

matcher6 = re.finditer('\s','sxd y cfvbh151 njklz xs72ay ')         #found spaces
for s in matcher6:
    print("match at {} ,End at {},pattern found {}".format(s.start(),s.end(),s.group()))

matcher7 = re.finditer('\w','sxd y cfvbh151 njklz xs72ay ')         #found alphanumeric
for t in matcher7:
    print("match at {} ,End at {},pattern found {}".format(t.start(),t.end(),t.group()))

matcher8 = re.finditer('\S','sxd y cfvbh151 njklz xs72ay ')         #except spaces
for u in matcher8:
    print("match at {} ,End at {},pattern found {}".format(u.start(),u.end(),u.group()))

matcher9 = re.finditer('\W','sxd y cfvbh151 njklz xs72ay ')         #except alphanumeric
for v in matcher9:
    print("match at {} ,End at {},pattern found {}".format(v.start(),v.end(),v.group()))


matcher10 = re.finditer('a+','sxd yaa cfvabh151n njk$lz xs72ay ')  #ATLEAST 1
for w in matcher10:
    print("match at {} ,End at {},pattern found {}".format(w.start(),w.end(),w.group()))

matcher11 = re.finditer('a*','sxd yaa cfvabh151n njk$lz xs72ay ')  #ATLEAST 0
for x in matcher11:
    print("match at {} ,End at {},pattern found {}".format(x.start(),x.end(),x.group()))

matcher12 = re.finditer('a?','sxd yaa cfvabh151n njk$lz xs72ay ')  #ATMOST 1
for y in matcher12:
    print("match at {} ,End at {},pattern found {}".format(y.start(),y.end(),y.group()))
