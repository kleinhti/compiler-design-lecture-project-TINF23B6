package com.auberer.compilerdesignlectureproject.codegen.instructions;

import com.auberer.compilerdesignlectureproject.codegen.IDumpable;
import com.auberer.compilerdesignlectureproject.codegen.IRunnable;
import com.auberer.compilerdesignlectureproject.interpreter.InterpreterEnvironment;

public interface IInstruction extends IDumpable, IRunnable {
  void trace(StringBuilder sb);
  void run(InterpreterEnvironment env);
}
