#
# Automatically generated file. DO NOT MODIFY
#

PRODUCT_SOONG_NAMESPACES += \
    vendor/xiaomi/pissarro-ims/blobs

PRODUCT_COPY_FILES += \
    vendor/xiaomi/pissarro-ims/blobs/proprietary/system/etc/init/init.vtservice.rc:$(TARGET_COPY_OUT_SYSTEM)/etc/init/init.vtservice.rc \
    vendor/xiaomi/pissarro-ims/blobs/proprietary/vendor/etc/init/init.vtservice_hidl.rc:$(TARGET_COPY_OUT_VENDOR)/etc/init/init.vtservice_hidl.rc

PRODUCT_PACKAGES += \
    libcomutils \
    libimsma \
    libimsma_adapt \
    libimsma_rtp \
    libimsma_socketwrapper \
    libmtk_vt_service \
    libmtk_vt_wrapper \
    libsignal \
    libsink \
    libsource \
    libvcodec_cap \
    libvcodec_capenc \
    libvt_avsync \
    vendor.mediatek.hardware.videotelephony@1.0 \
    vendor.mediatek.hardware.videotelephony@1.0-impl \
    vendor.mediatek.hardware.videotelephony@1.0 \
    ImsService \
    mediatek-common \
    mediatek-framework \
    mediatek-ims-base \
    mediatek-ims-common \
    mediatek-ims-extension-plugin \
    mediatek-telecom-common \
    mediatek-telephony-base \
    mediatek-telephony-common \
    vtservice \
    vtservice_hidl
