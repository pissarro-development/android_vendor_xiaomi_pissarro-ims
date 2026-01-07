#
# SPDX-FileCopyrightText: 2026 The LineageOS Project
# SPDX-License-Identifier: Apache-2.0
#

# Inherit from the proprietary version
include vendor/xiaomi/pissarro-ims/blobs/BoardConfigVendor.mk

IMS_PATH := vendor/xiaomi/pissarro-ims

# Properties
TARGET_VENDOR_PROP += \
	$(IMS_PATH)/configs/properties/vendor.prop