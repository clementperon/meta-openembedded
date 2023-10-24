LICENSE="MIT"

inherit cmake
DEPENDS += "protobuf"

do_configure:prepend() {
    echo "find_package(Protobuf REQUIRED CONFIG)" > ${S}/CMakeLists.txt
    echo "message(STATUS \"Version:\${Protobuf_VERSION}\")" >> ${S}/CMakeLists.txt
}

BBCLASSEXTEND = "nativesdk"
