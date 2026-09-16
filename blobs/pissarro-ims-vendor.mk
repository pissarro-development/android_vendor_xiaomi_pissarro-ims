#
# Automatically generated file. DO NOT MODIFY
#

PRODUCT_SOONG_NAMESPACES += \
    vendor/xiaomi/pissarro-ims/blobs

PRODUCT_COPY_FILES += \
    vendor/xiaomi/pissarro-ims/blobs/proprietary/system_ext/etc/init/init.vtservice.rc:$(TARGET_COPY_OUT_SYSTEM_EXT)/etc/init/init.vtservice.rc \
    vendor/xiaomi/pissarro-ims/blobs/proprietary/vendor/etc/init/init.vtservice_hidl.rc:$(TARGET_COPY_OUT_VENDOR)/etc/init/init.vtservice_hidl.rc

PRODUCT_PACKAGES += \
    vendor.mediatek.hardware.videotelephony@1.0-impl \
    vendor.mediatek.hardware.videotelephony@1.0_vendor \
    libcomutils \
    libimsma \
    libimsma_adapt \
    libimsma_rtp \
    libimsma_socketwrapper \
    libmtk_vt_service \
    libmtk_vt_wrapper \
    libsignal \
    libsink-mtk \
    libsource \
    libstagefright_foundation-mtk \
    libvcodec_cap \
    libvcodec_capenc \
    libvt_avsync \
    vendor.mediatek.hardware.videotelephony@1.0 \
    ImsService \
    MtkGbaService \
    mediatek-ims-base \
    mediatek-ims-common \
    mediatek-telephony-base \
    vtservice_hidl \
    vtservice

PRODUCT_BOOT_JARS += \
    system_ext:mediatek-ims-base \
    system_ext:mediatek-ims-common \
    system_ext:mediatek-telephony-base
