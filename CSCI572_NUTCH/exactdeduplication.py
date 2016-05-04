''' Algorithm that parses image files and calculates the hamming distance to detect exxact duplicates using metadata and parse text '''

import tika
import hashlib
from simhash import Simhash
tika.initVM()
from tika import parser

distance_text = 9999;
# Reading and Parsing the image file
parsed = parser.from_file('/Users/shivensaiwal/Desktop/scoringstats.png') 
parsedsecond = parser.from_file('/Users/shivensaiwal/Desktop/scoringstats.png')

# Extracting metadata and parsetext
str = parsed["metadata"]
contentdata = parsed["content"]
strsecond = parsedsecond["metadata"]
contentdatasecond = parsedsecond["content"]

# Creating string to pass as an argument to Simhhash function
content_text_first = contentdata.encode('utf-8')
if contentdatasecond : 
	content_text_second = contentdatasecond.encode('utf-8')

else:
	content_text_second= null

if contentdata : 
	content_text_first = contentdata.encode('utf-8')

else:
	content_text_first = null

str1 = ""
for key,value in str.iteritems():
	if isinstance(value, list):
		for x in value:
			str1 += x.encode('utf-8')
	else:
		str1 += value.encode('utf-8')


str2 = ""
for key,value in strsecond.iteritems():
	if isinstance(value, list):
		for x in value:
			str2 += x.encode('utf-8')
	else:
		str2 += value.encode('utf-8')

m1 = hashlib.md5()
c1 = hashlib.md5()
m2 = hashlib.md5()
c2 = hashlib.md5()


m1.update(str1)
m2.update(str2)
hashdata1 =  m1.hexdigest()
hashdata2 = m2.hexdigest()

# Computing hamming distance on the extracted text and metadata for the images which is used to predict exact duplicates.
distance_meta = Simhash(str1).distance(Simhash(str2))
print(distance_meta)

if (content_text_first and content_text_second):
	c1.update(content_text_first)
	c2.update(content_text_second)
	hashcontent1 = c1.hexdigest()
	hashcontent2 = c2.hexdigest()
	distance_text = Simhash(hashcontent1).distance(Simhash(hashcontent2))

print (distance_text)

if distance_text ==0 and distance_meta < 4 :
	print("Exact duplicate")
else :
	print("Not duplicate")
''' os.remove() can be used to remove duplicates from directory'''
