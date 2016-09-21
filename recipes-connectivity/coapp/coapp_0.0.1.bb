DESCRIPTION = "C++11 CoAP library"
AUTHOR = "Martin Mosler"
HOMEPAGE = "http://github.com/zerom0/CoAPP"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

PR = "r0"

SRCREV = "12293efb6e4040ebcf8ac63f6ea8758f472d77a5"
SRC_URI = " \
    git://github.com/zerom0/CoAPP;branch=yocto;protocol=git \
    file://0001-without_gtest.patch \
 "

S = "${WORKDIR}/git"

inherit cmake

FILES_${PN} += "${libdir}/libcoap.so"
FILES_${PN}-dev = ""
