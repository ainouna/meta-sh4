DESCRIPTION = "OpenGL ES v1.0 library and headers"

require audioniek-apps.inc

DEPENDS += " directfb"
CFLAGS_append = " -I${STAGING_INCDIR}/directfb -I${WORKDIR}/git/libs/libstgles/includes"

PROVIDES = "virtual/libgles1 virtual/egl"

S = "${WORKDIR}/git/libs/libstgles"

INSANE_SKIP_${PN} += "dev-so"
