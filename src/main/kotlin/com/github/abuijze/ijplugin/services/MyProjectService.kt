package com.github.abuijze.ijplugin.services

import com.intellij.openapi.project.Project
import com.github.abuijze.ijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
