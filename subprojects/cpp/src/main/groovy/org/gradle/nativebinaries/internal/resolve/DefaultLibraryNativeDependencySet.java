/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.nativebinaries.internal.resolve;

import org.gradle.api.file.FileCollection;
import org.gradle.nativebinaries.LibraryBinary;
import org.gradle.nativebinaries.internal.LibraryBinaryInternal;

public class DefaultLibraryNativeDependencySet implements LibraryNativeDependencySet {
    private final LibraryBinaryInternal binary;

    public DefaultLibraryNativeDependencySet(LibraryBinaryInternal binary) {
        this.binary = binary;
    }

    public FileCollection getIncludeRoots() {
        return binary.getHeaderDirs();
    }

    public FileCollection getLinkFiles() {
        return binary.getLinkFiles();
    }

    public FileCollection getRuntimeFiles() {
        return binary.getRuntimeFiles();
    }

    public LibraryBinary getLibraryBinary() {
        return binary;
    }
}
