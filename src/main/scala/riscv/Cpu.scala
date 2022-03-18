package riscv
/*
 * CPU (core) Module for RISC-V
 *
 * Author:
 *
 */

import chisel3._
import chisel3.util._

class Cpu extends Module{
  val io = IO(new Bundle {
    val diag = Output(UInt(32.W))
    })

  // Instantiate ALU
  val alu = Module(new Alu())

  // Instantiate Control
  val control = Module(new Control())

  // Instantiate RegisterFile
  val register_file = Module(new RegisterFile())

  // Instantiate Data Memory
  val data_memory = Module(new DataMemory())

  // Instantiate Data Memory
  val instruction_memory = Module(new InstructionMemory())

  // Dummy Connections:
  io.diag := 0.U
  alu.io.a  := 0.U
  alu.io.b  := 0.U
  control.io.instruction := 0.U
}

object CpuMain extends App {
  println("Generating the Cpu hardware")
  emitVerilog(new Cpu(), Array("--target-dir", "generated"))
}
