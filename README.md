# meta-iot

This is a yocto layer for building a autonomous (serverless) distributed IoT applications with RaspberryPi boards.

## Build instructions 

Inspired by http://www.jumpnowtek.com/rpi/Raspberry-Pi-Systems-with-Yocto.html

### Fetch the poky repo and openembedded and raspberrypi layers

	git clone -b krogoth git://git.yoctoproject.org/poky.git poky
	cd poky
	git clone -b krogoth git://git.openembedded.org/meta-openembedded
	git clone -b master git://git.yoctoproject.org/meta-raspberrypi
	cd ..

### Fetch the rpi and iot layers

	mkdir rpi
	cd rpi
	git clone -b krogoth git://github.com/jumpnow/meta-rpi
	git clone -b master git://github.com/zerom0/meta-iot
	cd ..

### Setup the build configuration

	source poky/oe-init-build-env ~/rpi/build
	cp ../meta-iot/conf/local.conf-sample conf/local.conf
	cp ../meta-iot/conf/bblayers.conf-sample conf/bblayers.conf

### Build it

	bitbake autom8-image

### Prepare SD card

	cd ../meta-rpi/scripts
	./mk2parts.sh sdd
	sudo mkdir /media/card
	export OETMP=~/rpi/build/tmp
	export MACHINE=raspberrypi2
	./copy_boot.sh sdd
	./copy_rootfs.sh sdd autom8
