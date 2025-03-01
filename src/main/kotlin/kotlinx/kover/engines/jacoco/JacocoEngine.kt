/*
 * Copyright 2017-2022 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */
package kotlinx.kover.engines.jacoco

internal fun getJacocoDependencies(engineVersion: String): List<String> {
    return listOf("org.jacoco:org.jacoco.agent:$engineVersion", "org.jacoco:org.jacoco.ant:$engineVersion")
}


