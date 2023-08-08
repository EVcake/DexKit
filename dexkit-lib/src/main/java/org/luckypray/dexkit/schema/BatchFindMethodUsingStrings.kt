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
class BatchFindMethodUsingStrings : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : BatchFindMethodUsingStrings {
        __init(_i, _bb)
        return this
    }
    val findPackageName : StringMatcher? get() = findPackageName(StringMatcher())
    fun findPackageName(obj: StringMatcher) : StringMatcher? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
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
    fun inMethods(j: Int) : ULong {
        val o = __offset(8)
        return if (o != 0) {
            bb.getLong(__vector(o) + j * 8).toULong()
        } else {
            0uL
        }
    }
    val inMethodsLength : Int
        get() {
            val o = __offset(8); return if (o != 0) __vector_len(o) else 0
        }
    val inMethodsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(8, 8)
    fun inMethodsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 8, 8)
    fun matchers(j: Int) : BatchUsingStringsMatcher? = matchers(BatchUsingStringsMatcher(), j)
    fun matchers(obj: BatchUsingStringsMatcher, j: Int) : BatchUsingStringsMatcher? {
        val o = __offset(10)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val matchersLength : Int
        get() {
            val o = __offset(10); return if (o != 0) __vector_len(o) else 0
        }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsBatchFindMethodUsingStrings(_bb: ByteBuffer): BatchFindMethodUsingStrings = getRootAsBatchFindMethodUsingStrings(_bb, BatchFindMethodUsingStrings())
        fun getRootAsBatchFindMethodUsingStrings(_bb: ByteBuffer, obj: BatchFindMethodUsingStrings): BatchFindMethodUsingStrings {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createBatchFindMethodUsingStrings(builder: FlatBufferBuilder, findPackageNameOffset: Int, inClassesOffset: Int, inMethodsOffset: Int, matchersOffset: Int) : Int {
            builder.startTable(4)
            addMatchers(builder, matchersOffset)
            addInMethods(builder, inMethodsOffset)
            addInClasses(builder, inClassesOffset)
            addFindPackageName(builder, findPackageNameOffset)
            return endBatchFindMethodUsingStrings(builder)
        }
        fun startBatchFindMethodUsingStrings(builder: FlatBufferBuilder) = builder.startTable(4)
        fun addFindPackageName(builder: FlatBufferBuilder, findPackageName: Int) = builder.addOffset(0, findPackageName, 0)
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
        fun addInMethods(builder: FlatBufferBuilder, inMethods: Int) = builder.addOffset(2, inMethods, 0)
        @kotlin.ExperimentalUnsignedTypes
        fun createInMethodsVector(builder: FlatBufferBuilder, data: ULongArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addLong(data[i].toLong())
            }
            return builder.endVector()
        }
        fun startInMethodsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addMatchers(builder: FlatBufferBuilder, matchers: Int) = builder.addOffset(3, matchers, 0)
        fun createMatchersVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startMatchersVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun endBatchFindMethodUsingStrings(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
