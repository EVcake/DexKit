// automatically generated by the FlatBuffers compiler, do not modify

package org.luckypray.dexkit.schema

import com.google.flatbuffers.BaseVector
import com.google.flatbuffers.BooleanVector
import com.google.flatbuffers.ByteVector
import com.google.flatbuffers.Constants
import com.google.flatbuffers.DoubleVector
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.FloatVector
import com.google.flatbuffers.LongVector
import com.google.flatbuffers.StringVector
import com.google.flatbuffers.Struct
import com.google.flatbuffers.Table
import com.google.flatbuffers.UnionVector
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.sign

@Suppress("unused")
class FindClass : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : FindClass {
        __init(_i, _bb)
        return this
    }
    val uniqueResult : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    fun inClasses(j: Int) : ULong {
        val o = __offset(6)
        return if (o != 0) {
            bb.getLong(__vector(o) + j * 8).toULong()
        } else {
            0uL
        }
    }
    val inClassesLength : Int
        get() {
            val o = __offset(6); return if (o != 0) __vector_len(o) else 0
        }
    val inClassesAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 8)
    fun inClassesInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 8)
    val matcher : ClassMatcher? get() = matcher(ClassMatcher())
    fun matcher(obj: ClassMatcher) : ClassMatcher? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsFindClass(_bb: ByteBuffer): FindClass = getRootAsFindClass(_bb, FindClass())
        fun getRootAsFindClass(_bb: ByteBuffer, obj: FindClass): FindClass {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createFindClass(builder: FlatBufferBuilder, uniqueResult: Boolean, inClassesOffset: Int, matcherOffset: Int) : Int {
            builder.startTable(3)
            addMatcher(builder, matcherOffset)
            addInClasses(builder, inClassesOffset)
            addUniqueResult(builder, uniqueResult)
            return endFindClass(builder)
        }
        fun startFindClass(builder: FlatBufferBuilder) = builder.startTable(3)
        fun addUniqueResult(builder: FlatBufferBuilder, uniqueResult: Boolean) = builder.addBoolean(0, uniqueResult, false)
        fun addInClasses(builder: FlatBufferBuilder, inClasses: Int) = builder.addOffset(1, inClasses, 0)
        @kotlin.ExperimentalUnsignedTypes
        fun createInClassesVector(builder: FlatBufferBuilder, data: ULongArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addLong(data[i].toLong())
            }
            return builder.endVector()
        }
        fun startInClassesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addMatcher(builder: FlatBufferBuilder, matcher: Int) = builder.addOffset(2, matcher, 0)
        fun endFindClass(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
