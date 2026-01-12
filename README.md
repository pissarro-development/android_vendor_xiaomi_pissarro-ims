# MediaTek IMS (from pissarro)

## Getting Started:

### Cloning:
Clone this repo into your working directory by:
```
git clone https://github.com/pissarro-development/android_vendor_xiaomi_pissarro-ims.git vendor/xiaomi/pissarro-ims
```

### Changes Required :
You will need following changes in your device tree:

• In BoardConfig.mk
```
include vendor/xiaomi/pissarro-ims/BoardConfig.mk
```

• In device.mk
```
$(call inherit-product, vendor/xiaomi/pissarro-ims/ims.mk)
```