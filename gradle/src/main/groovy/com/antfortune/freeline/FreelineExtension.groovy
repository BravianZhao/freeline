package com.antfortune.freeline

import org.gradle.api.Project

/**
 * Created by huangyong on 16/5/19.
 */
class FreelineExtension {

    String productFlavor = ""

    boolean hack = false

    String buildScript = ""

    String apkPath = ""

    String buildScriptWorkDirectory = ""

    List<String> extraResourceDependencyPaths = []

    List<String> excludeResourceDependencyPaths = []

    List<String> excludeHackClasses = []

    boolean foceLowerVersion = false

    FreelineExtension(Project project) {
    }
}
