#!/usr/bin/env -S PYTHONPATH=../../../tools/extract-utils python3
#
# SPDX-FileCopyrightText: 2026 The LineageOS Project
# SPDX-License-Identifier: Apache-2.0
#

from os import path
import extract_utils.tools

from extract_utils.main import (
    ExtractUtils,
    ExtractUtilsModule,
)

from extract_utils.fixups_blob import (
    blob_fixup,
    blob_fixups_user_type,
)

vendor = 'xiaomi'
dir = 'pissarro-ims' 

blob_fixups: blob_fixups_user_type = {
    (
        'system/lib64/libimsma.so'
    ): blob_fixup()
        .replace_needed('libsink.so', 'libsink-mtk.so'),
    (
        'system/lib64/libsink-mtk.so'
    ): blob_fixup()
        .add_needed('libaudioclient_shim.so')
}

module = ExtractUtilsModule(
    vendor = vendor,
    device = dir,
    device_rel_path = path.join('vendor', vendor, dir),
    blob_fixups = blob_fixups
)

module.vendor_path = 'blobs'
module.vendor_rel_path = path.join('vendor', vendor, dir, 'blobs')

if __name__ == '__main__':
    utils = ExtractUtils.device(module)
    utils.run()