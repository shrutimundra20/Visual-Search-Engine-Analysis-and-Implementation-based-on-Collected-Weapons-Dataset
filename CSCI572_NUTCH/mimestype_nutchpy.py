import nutchpy
import mimetypes
#!/usr/bin/python

node_path="/Users/pranalijhaveri/Desktop/nutch/pranali/Shiven_mimetest/20151013175716/parse_data/part-00000/data"
seq_reader=nutchpy.sequence_reader
fo = open("gettingmime_parsetext.txt", "w")
f1=open("mimetypes.txt","w")
data = nutchpy.sequence_reader.read(node_path)
for list_item in data:
    f1.write(str(mimetypes.guess_type(list_item[0], strict=False)))
    f1.write("\n")

    #write_str=str(mimetypes.guess_type(list_item[0], strict=True))
#f1.write(write_str)

''' USe this code to slice the metadata as per specified range'''
#print(seq_reader.head(10,node_path))
#print(seq_reader.slice(0,25000,node_path))
#data = seq_reader.read(seq_reader,node_path,)
#print(data)
#string = seq_reader.slice(20,25000,node_path)

#fr= open("head_tryShiven10-10.txt","w")
#fr.write(str(seq_reader.head(10,node_path)))
"""for list_item in string:
    print(list_item[0])# Prints the url
    fo.write(list_item[0])
    print(list_item[1]) # Prints details abt the url
    fo.write(list_item[1])"""

