DESCRIPTION = "C++11 CoAP library"
AUTHOR = "Martin Mosler"
HOMEPAGE = "http://github.com/zerom0/autom8"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

PR = "r0"

DEPENDS += "coapp"

SRCREV = "457180411aaa85872fd96dfe0ee3f455435be791"
SRC_URI = " \
    git://github.com/zerom0/autom8;branch=development;protocol=git \
 "

S = "${WORKDIR}/git"

inherit pkgconfig cmake
