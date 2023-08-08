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
class FindField : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : FindField {
        __init(_i, _bb)
        return this
    }
    val uniqueResult : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    fun inFields(j: Int) : ULong {
        val o = __offset(6)
        return if (o != 0) {
            bb.getLong(__vector(o) + j * 8).toULong()
        } else {
            0uL
        }
    }
    val inFieldsLength : Int
        get() {
            val o = __offset(6); return if (o != 0) __vector_len(o) else 0
        }
    val inFieldsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 8)
    fun inFieldsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 8)
    val matcher : FieldMatcher? get() = matcher(FieldMatcher())
    fun matcher(obj: FieldMatcher) : FieldMatcher? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsFindField(_bb: ByteBuffer): FindField = getRootAsFindField(_bb, FindField())
        fun getRootAsFindField(_bb: ByteBuffer, obj: FindField): FindField {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createFindField(builder: FlatBufferBuilder, uniqueResult: Boolean, inFieldsOffset: Int, matcherOffset: Int) : Int {
            builder.startTable(3)
            addMatcher(builder, matcherOffset)
            addInFields(builder, inFieldsOffset)
            addUniqueResult(builder, uniqueResult)
            return endFindField(builder)
        }
        fun startFindField(builder: FlatBufferBuilder) = builder.startTable(3)
        fun addUniqueResult(builder: FlatBufferBuilder, uniqueResult: Boolean) = builder.addBoolean(0, uniqueResult, false)
        fun addInFields(builder: FlatBufferBuilder, inFields: Int) = builder.addOffset(1, inFields, 0)
        @kotlin.ExperimentalUnsignedTypes
        fun createInFieldsVector(builder: FlatBufferBuilder, data: ULongArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addLong(data[i].toLong())
            }
            return builder.endVector()
        }
        fun startInFieldsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addMatcher(builder: FlatBufferBuilder, matcher: Int) = builder.addOffset(2, matcher, 0)
        fun endFindField(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
