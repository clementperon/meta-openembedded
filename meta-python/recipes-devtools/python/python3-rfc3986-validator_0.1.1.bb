SUMMARY = "Pure python rfc3986 validator"
HOMEPAGE = "https://github.com/naimetti/rfc3986-validator"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a21b13b5a996f08f7e0b088aa38ce9c6"

SRC_URI[sha256sum] = "3d44bde7921b3b9ec3ae4e3adca370438eccebc676456449b145d533b240d055"

PYPI_PACKAGE = "rfc3986_validator"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"

inherit pypi setuptools3

SRC_URI += "\
    file://0001-setup.py-move-pytest-runner-to-test_requirements.patch \
"

RDEPENDS:${PN} += "\
    python3-core \
"

BBCLASSEXTEND = "native nativesdk"
