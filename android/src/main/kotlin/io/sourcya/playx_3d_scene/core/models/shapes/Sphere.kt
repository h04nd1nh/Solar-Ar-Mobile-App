package io.sourcya.playx_3d_scene.core.models.shapes

import io.sourcya.playx_3d_scene.core.models.scene.material.Material

 class Cube(
     id:Int? = null,
     centerPosition: Position? = null,
     size : Size? = null,
     material: Material? = null
) : Shape(id,centerPosition, size, null, material)