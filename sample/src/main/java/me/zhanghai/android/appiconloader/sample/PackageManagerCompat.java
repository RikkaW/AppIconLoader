/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.zhanghai.android.appiconloader.sample;

import android.content.pm.PackageManager;
import android.os.Build;

public class PackageManagerCompat {
    private PackageManagerCompat() {}

    public static final int MATCH_UNINSTALLED_PACKAGES =
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.N ?
                    PackageManager.MATCH_UNINSTALLED_PACKAGES
                    : PackageManager.GET_UNINSTALLED_PACKAGES;
}
