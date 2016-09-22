SUMMARY = "GPIO monitor"
DESCRIPTION = "Monitory GPIO ports and forwards their values via mosquitto"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=07385c0461c3c1f4af51069c2042e8fa"

DEPENDS = "mosquitto"

PR = "r0"

SRC_URI = "file://LICENSE \
           file://gpiosis.sh \
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 gpiosis.sh ${D}${bindir}/
}
