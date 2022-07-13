package com.github.pahan35.nestjstesthelper.services

import com.intellij.openapi.project.Project
import com.github.pahan35.nestjstesthelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
