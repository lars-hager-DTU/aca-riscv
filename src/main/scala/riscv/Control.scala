/*
 * Control Module for RISC-V
 *
 * Author:
 *
 */

package riscv

import chisel3._
import chisel3.util._

class Control extends Module {
  val io = IO(new Bundle {
    val instruction = Input(UInt(32.W))
    val alu_op = Output(UInt(2.W))
    val reg_write = Output(UInt(1.W))
    val alu_src = Output(UInt(1.W))
    val pc_src = Output(UInt(64.W))  // 64-bit PC
    val mem_read = Output(UInt(1.W))
    val mem_write = Output(UInt(1.W))
    val mem_to_reg = Output(UInt(1.W))
  })

  // Dummy outputs:
  io.alu_op       := 0.U
  io.reg_write    := 0.U
  io.alu_src      := 0.U
  io.pc_src       := 0.U
  io.mem_read     := 0.U
  io.mem_write    := 0.U
  io.mem_to_reg   := 0.U

}

object ControlMain extends App {
  println("Generating the Control hardware")
  emitVerilog(new Control(), Array("--target-dir", "generated"))
}