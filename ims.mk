#
# SPDX-FileCopyrightText: The LineageOS Project
# SPDX-License-Identifier: Apache-2.0
#

# Inherit from the proprietary version
$(call inherit-product, vendor/xiaomi/pissarro-ims/blobs/pissarro-ims-vendor.mk)

# IMS
PRODUCT_PACKAGES += \
    ImsService \
    MtkGbaService

$(call inherit-product, hardware/mediatek/frameworks/mediatek-frameworks.mk)

# Overlays
PRODUCT_PACKAGES += \
    FrameworksResOverlayPissarroIms \
	TelephonyResOverlayPissarroIms

# Permissions
PRODUCT_COPY_FILES += \
	$(LOCAL_PATH)/configs/permissions/privapp-permissions-com.mediatek.ims.xml:$(TARGET_COPY_OUT_SYSTEM_EXT)/etc/permissions/privapp-permissions-com.mediatek.ims.xml

PRODUCT_COPY_FILES += \
    frameworks/native/data/etc/android.hardware.telephony.ims.xml:$(TARGET_COPY_OUT_VENDOR)/etc/permissions/android.hardware.telephony.ims.xml