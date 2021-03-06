// Code generated by Wire protocol buffer compiler, do not edit.
// Source: com.squareup.wire.whiteboard.WhiteboardUpdate in com/squareup/wire/whiteboard/whiteboard.proto
package com.squareup.wire.whiteboard

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.internal.countNonNull
import com.squareup.wire.internal.immutableCopyOf
import com.squareup.wire.internal.missingRequiredFields
import com.squareup.wire.internal.redactElements
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class WhiteboardUpdate(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.whiteboard.WhiteboardUpdate${'$'}InitialiseBoard#ADAPTER"
  )
  val initialise_board: InitialiseBoard? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.whiteboard.WhiteboardUpdate${'$'}UpdatePoints#ADAPTER"
  )
  val update_points: UpdatePoints? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<WhiteboardUpdate, Nothing>(ADAPTER, unknownFields) {
  init {
    require(countNonNull(initialise_board, update_points) <= 1) {
      "At most one of initialise_board, update_points may be non-null"
    }
  }

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is WhiteboardUpdate) return false
    if (unknownFields != other.unknownFields) return false
    if (initialise_board != other.initialise_board) return false
    if (update_points != other.update_points) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + initialise_board.hashCode()
      result = result * 37 + update_points.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (initialise_board != null) result += """initialise_board=$initialise_board"""
    if (update_points != null) result += """update_points=$update_points"""
    return result.joinToString(prefix = "WhiteboardUpdate{", separator = ", ", postfix = "}")
  }

  fun copy(
    initialise_board: InitialiseBoard? = this.initialise_board,
    update_points: UpdatePoints? = this.update_points,
    unknownFields: ByteString = this.unknownFields
  ): WhiteboardUpdate = WhiteboardUpdate(initialise_board, update_points, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<WhiteboardUpdate> = object : ProtoAdapter<WhiteboardUpdate>(
      FieldEncoding.LENGTH_DELIMITED, 
      WhiteboardUpdate::class, 
      "type.googleapis.com/com.squareup.wire.whiteboard.WhiteboardUpdate", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: WhiteboardUpdate): Int {
        var size = value.unknownFields.size
        size += InitialiseBoard.ADAPTER.encodedSizeWithTag(1, value.initialise_board)
        size += UpdatePoints.ADAPTER.encodedSizeWithTag(2, value.update_points)
        return size
      }

      override fun encode(writer: ProtoWriter, value: WhiteboardUpdate) {
        InitialiseBoard.ADAPTER.encodeWithTag(writer, 1, value.initialise_board)
        UpdatePoints.ADAPTER.encodeWithTag(writer, 2, value.update_points)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): WhiteboardUpdate {
        var initialise_board: InitialiseBoard? = null
        var update_points: UpdatePoints? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> initialise_board = InitialiseBoard.ADAPTER.decode(reader)
            2 -> update_points = UpdatePoints.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return WhiteboardUpdate(
          initialise_board = initialise_board,
          update_points = update_points,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: WhiteboardUpdate): WhiteboardUpdate = value.copy(
        initialise_board = value.initialise_board?.let(InitialiseBoard.ADAPTER::redact),
        update_points = value.update_points?.let(UpdatePoints.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  class InitialiseBoard(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REQUIRED
    )
    val width: Int,
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REQUIRED
    )
    val height: Int,
    @field:WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REQUIRED
    )
    val color: Int,
    unknownFields: ByteString = ByteString.EMPTY
  ) : Message<InitialiseBoard, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Nothing = throw AssertionError()

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is InitialiseBoard) return false
      if (unknownFields != other.unknownFields) return false
      if (width != other.width) return false
      if (height != other.height) return false
      if (color != other.color) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + width.hashCode()
        result = result * 37 + height.hashCode()
        result = result * 37 + color.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      result += """width=$width"""
      result += """height=$height"""
      result += """color=$color"""
      return result.joinToString(prefix = "InitialiseBoard{", separator = ", ", postfix = "}")
    }

    fun copy(
      width: Int = this.width,
      height: Int = this.height,
      color: Int = this.color,
      unknownFields: ByteString = this.unknownFields
    ): InitialiseBoard = InitialiseBoard(width, height, color, unknownFields)

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<InitialiseBoard> = object : ProtoAdapter<InitialiseBoard>(
        FieldEncoding.LENGTH_DELIMITED, 
        InitialiseBoard::class, 
        "type.googleapis.com/com.squareup.wire.whiteboard.WhiteboardUpdate.InitialiseBoard", 
        PROTO_2, 
        null
      ) {
        override fun encodedSize(value: InitialiseBoard): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.width)
          size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.height)
          size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.color)
          return size
        }

        override fun encode(writer: ProtoWriter, value: InitialiseBoard) {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.width)
          ProtoAdapter.INT32.encodeWithTag(writer, 2, value.height)
          ProtoAdapter.INT32.encodeWithTag(writer, 3, value.color)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): InitialiseBoard {
          var width: Int? = null
          var height: Int? = null
          var color: Int? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> width = ProtoAdapter.INT32.decode(reader)
              2 -> height = ProtoAdapter.INT32.decode(reader)
              3 -> color = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return InitialiseBoard(
            width = width ?: throw missingRequiredFields(width, "width"),
            height = height ?: throw missingRequiredFields(height, "height"),
            color = color ?: throw missingRequiredFields(color, "color"),
            unknownFields = unknownFields
          )
        }

        override fun redact(value: InitialiseBoard): InitialiseBoard = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  class UpdatePoints(
    points: List<Point> = emptyList(),
    unknownFields: ByteString = ByteString.EMPTY
  ) : Message<UpdatePoints, Nothing>(ADAPTER, unknownFields) {
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.whiteboard.Point#ADAPTER",
      label = WireField.Label.REPEATED
    )
    val points: List<Point> = immutableCopyOf("points", points)

    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Nothing = throw AssertionError()

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is UpdatePoints) return false
      if (unknownFields != other.unknownFields) return false
      if (points != other.points) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + points.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (points.isNotEmpty()) result += """points=$points"""
      return result.joinToString(prefix = "UpdatePoints{", separator = ", ", postfix = "}")
    }

    fun copy(points: List<Point> = this.points, unknownFields: ByteString = this.unknownFields):
        UpdatePoints = UpdatePoints(points, unknownFields)

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<UpdatePoints> = object : ProtoAdapter<UpdatePoints>(
        FieldEncoding.LENGTH_DELIMITED, 
        UpdatePoints::class, 
        "type.googleapis.com/com.squareup.wire.whiteboard.WhiteboardUpdate.UpdatePoints", 
        PROTO_2, 
        null
      ) {
        override fun encodedSize(value: UpdatePoints): Int {
          var size = value.unknownFields.size
          size += Point.ADAPTER.asRepeated().encodedSizeWithTag(1, value.points)
          return size
        }

        override fun encode(writer: ProtoWriter, value: UpdatePoints) {
          Point.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.points)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): UpdatePoints {
          val points = mutableListOf<Point>()
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> points.add(Point.ADAPTER.decode(reader))
              else -> reader.readUnknownField(tag)
            }
          }
          return UpdatePoints(
            points = points,
            unknownFields = unknownFields
          )
        }

        override fun redact(value: UpdatePoints): UpdatePoints = value.copy(
          points = value.points.redactElements(Point.ADAPTER),
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }
}
