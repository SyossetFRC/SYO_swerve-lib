package com.syossetfrc.swervelib;

import com.revrobotics.RelativeEncoder;

public interface SwerveModule {
    double getDriveVelocity();

    double getSteerAngle();

    RelativeEncoder getDriveEncoder();

    void setIdleMode(int mode);

    void set(double driveVoltage, double steerAngle);
}
