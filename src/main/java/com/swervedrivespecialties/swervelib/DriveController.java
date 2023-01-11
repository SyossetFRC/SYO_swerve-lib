package com.syossetfrc.swervelib;

import com.revrobotics.RelativeEncoder;

public interface DriveController {
    void setReferenceVoltage(double voltage);

    double getStateVelocity();

    RelativeEncoder getEncoder();
}
