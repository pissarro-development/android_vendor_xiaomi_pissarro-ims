#
# SPDX-FileCopyrightText: The LineageOS Project
# SPDX-License-Identifier: Apache-2.0
#

# Inherit from the proprietary version
$(call inherit-product, vendor/xiaomi/pissarro-ims/blobs/pissarro-ims-vendor.mk)

# IMS (App)
PRODUCT_PACKAGES += \
    ImsService \
    MtkGbaService

# IMS (Jars)
PRODUCT_BOOT_JARS += \
    mediatek-common \
    mediatek-framework \
    mediatek-ims-base \
    mediatek-ims-common \
	mediatek-ims-extension-plugin \
    mediatek-telecom-common \
    mediatek-telephony-base \
    mediatek-telephony-common

# Permissions
PRODUCT_COPY_FILES += \
	$(LOCAL_PATH)/configs/permissions/privapp-permissions-com.mediatek.ims.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/permissions/privapp-permissions-com.mediatek.ims.xml

PRODUCT_COPY_FILES += \
    frameworks/native/data/etc/android.hardware.telephony.ims.xml:$(TARGET_COPY_OUT_VENDOR)/etc/permissions/android.hardware.telephony.ims.xml