package com.example.androidlearn.data

import com.example.androidlearn.R
import com.example.androidlearn.model.Topics

class DataSource {

    fun loadTopics(): List<Topics> {
        return listOf(
            Topics(
                "Getting started with Kotlin",
                "Kotlin is a statically-typed object-oriented programming language developed by JetBrains primarily targeting the JVM. Kotlin is developed with the goals of being quick to compile, backwardscompatible, very type safe, and 100% interoperable with Java. Kotlin is also developed with the\n" +
                        "goal of providing many of the features wanted by Java developers. Kotlin's standard compiler allows it to be compiled both into Java bytecode for the JVM and into JavaScript",
                R.drawable.kotlin
            ),
            Topics(
                "Compiling Kotlin",
                "Kotlin has a standard IDE plugin for Eclipse and IntelliJ. Kotlin can also be compiled using Maven,using Ant, and using Gradle, or through the command line. It is worth noting in kotlinc Main.kt will output a java class file, in this case MainKt.class (Note the Kt appended to the class name)",
                R.drawable.compilingkotlin
            ),
            Topics(
                "Arrays",
                "Generic arrays in Kotlin are represented by Array<T>. To create an empty array, use emptyArray<T>() factory function: val empty = emptyArray<String>()",
                R.drawable.arrays
            ),
            Topics(
                "Getting started with Kotlin",
                "Kotlin is a statically-typed object-oriented programming language developed by JetBrains primarily targeting the JVM. Kotlin is developed with the goals of being quick to compile, backwardscompatible, very type safe, and 100% interoperable with Java. Kotlin is also developed with the\n" +
                        "goal of providing many of the features wanted by Java developers. Kotlin's standard compiler allows it to be compiled both into Java bytecode for the JVM and into JavaScript",
                R.drawable.kotlin
            ),
            Topics(
                "Compiling Kotlin",
                "Kotlin has a standard IDE plugin for Eclipse and IntelliJ. Kotlin can also be compiled using Maven,using Ant, and using Gradle, or through the command line. It is worth noting in kotlinc Main.kt will output a java class file, in this case MainKt.class (Note the Kt appended to the class name)",
                R.drawable.compilingkotlin
            ),
            Topics(
                "Arrays",
                "Generic arrays in Kotlin are represented by Array<T>. To create an empty array, use emptyArray<T>() factory function: val empty = emptyArray<String>()",
                R.drawable.arrays
            ),
            Topics(
                "Getting started with Kotlin",
                "Kotlin is a statically-typed object-oriented programming language developed by JetBrains primarily targeting the JVM. Kotlin is developed with the goals of being quick to compile, backwardscompatible, very type safe, and 100% interoperable with Java. Kotlin is also developed with the\n" +
                        "goal of providing many of the features wanted by Java developers. Kotlin's standard compiler allows it to be compiled both into Java bytecode for the JVM and into JavaScript",
                R.drawable.kotlin
            ),
            Topics(
                "Compiling Kotlin",
                "Kotlin has a standard IDE plugin for Eclipse and IntelliJ. Kotlin can also be compiled using Maven,using Ant, and using Gradle, or through the command line. It is worth noting in kotlinc Main.kt will output a java class file, in this case MainKt.class (Note the Kt appended to the class name)",
                R.drawable.compilingkotlin
            ),
            Topics(
                "Arrays",
                "Generic arrays in Kotlin are represented by Array<T>. To create an empty array, use emptyArray<T>() factory function: val empty = emptyArray<String>()",
                R.drawable.arrays
            )

        )

    }
}