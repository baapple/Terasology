/*
 * Copyright 2013 MovingBlocks
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
package org.terasology.world.lighting;

import org.terasology.math.Vector3i;
import org.terasology.world.block.Block;

/**
 * A view providing access to the world for batch propagation
 *
 * @author Immortius
 */
public interface PropagatorWorldView {

    /**
     * @param pos
     * @return The value of interest at pos
     */
    byte getValueAt(Vector3i pos);

    /**
     * @param pos
     * @param value A new value at pos.
     */
    void setValueAt(Vector3i pos, byte value);

    /**
     * @param pos
     * @return The block at pos
     */
    Block getBlockAt(Vector3i pos);

    /**
     * @param pos
     * @return Whether pos is in the bounds of the world view
     */
    boolean isInBounds(Vector3i pos);
}