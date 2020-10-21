package com.nitrol

import kotlin.test.Test
import kotlin.test.assertTrue

class WalkingSkeletonTest {
    @Test
    fun `walking skeleton`() {
        assertTrue { WalkingSkeleton().isWorking() }
    }
}