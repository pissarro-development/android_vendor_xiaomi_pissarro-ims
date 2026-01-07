#
# SPDX-FileCopyrightText: 2026 The LineageOS Project
# SPDX-License-Identifier: Apache-2.0
#

# Inherit from the proprietary version
$(call inherit-product, vendor/xiaomi/pissarro-ims/blobs/pissarro-ims-vendor.mk)

# IMS (App)
PRODUCT_PACKAGES += \
    ImsService

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