// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pnuematics extends SubsystemBase {
  private final DoubleSolenoid solenoid;

  public Pnuematics() {
    solenoid = new DoubleSolenoid(2, PneumaticsModuleType.REVPH,
      Constants.FORWARD_CHANNEL,
      Constants.REVERSE_CHANNEL);
  }

  public void toggleSolenoid() 
  {
    Value value = solenoid.get() == Value.kForward ?

    Value.kReverse : Value.kForward;

    solenoid.set(value);
  }
}
