SUMMARY  = "pandas library for high-performance data analysis tools"
DESCRIPTION = "pandas is an open source, BSD-licensed library providing \
high-performance, easy-to-use data structures and data analysis tools for \
the Python programming language."
HOMEPAGE = "http://pandas.pydata.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c2a8f987b2ce77c368c6b3e1b5b10774"

SRC_URI[sha256sum] = "14abb8ea73fce8aebbb1fb44bec809163f1c55241bcc1db91c2c780e97265033"

inherit pypi setuptools3

DEPENDS += " \
    ${PYTHON_PN}-numpy-native ${PYTHON_PN}-cython-native \
"

CFLAGS_append_toolchain-clang = " -Wno-error=deprecated-declarations"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-numpy \
    ${PYTHON_PN}-dateutil \
    ${PYTHON_PN}-pytz \
    ${PYTHON_PN}-profile \
"