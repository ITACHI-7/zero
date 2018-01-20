from urllib2 import Request,urlopen,URLError
from serial import serial
serial_line=''
ser=serial.Serial("/dev/ttyUSB0",9600)
while(1):
	serial_line=ser.readline()
	url="http://localhost:8090/commodity/"+serial_line
	print url
#re= Request(url)
#response = urlopen(re)
#data= response.read()
#print data
