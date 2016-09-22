#!/bin/sh
GPIOS=(20 21)

for i in ${GPIOS[*]}; do
	echo $i
	echo $i > /sys/class/gpio/export
	echo in > /sys/class/gpio/gpio$i/direction
done

while true; do
	for i in ${GPIOS[*]}; do
		mosquitto_pub -m `cat /sys/class/gpio/gpio$i/value` -t gpio$i
	done
	sleep 1
done
