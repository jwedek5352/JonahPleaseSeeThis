package frc.robot.subsystems

import com.revrobotics.ColorSensorV3
import edu.wpi.first.wpilibj.I2C
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import kotlin.math.sqrt

//x represents rotations, but x was easier to write MICAH//
var x = 0
    get() = field
    set(value) {
        field = value}

object ColorthingySubsystem : SubsystemBase() {

    val colorSensor = ColorSensorV

    import com.revrobotics.ColorSensorV3
    import edu.wpi.first.wpilibj.I2C
    import edu.wpi.first.wpilibj2.command.SubsystemBase;
    import kotlin.math.sqrt

    //x represents rotations, but x was easier to write MICAH//
    var x = 0
        get() = field
        set(value) {
            field = value}

    object ColorthingySubsystem : SubsystemBase() {

        val colorSensor = ColorSensorV3(I2C.Port.kOnboard)
        fun euclidean(): Double {
            return sqrt(((colorSensor.red * colorSensor.red) + (colorSensor.green * colorSensor.green) + (colorSensor.blue * colorSensor.blue)).toDouble())
        }
        fun whitepaper() {
            if (colorSensor.red >= 200 && colorSensor.blue >= 200 && colorSensor.green >= 200)
                x ++
        }
        override fun periodic() {
            super.periodic()
        }
    }3(I2C.Port.kOnboard)
    fun euclidean(): Double {
         return sqrt(((colorSensor.red * colorSensor.red) + (colorSensor.green * colorSensor.green) + (colorSensor.blue * colorSensor.blue)).toDouble())
    }
    fun whitepaper() {
        if (colorSensor.red >= 200 && colorSensor.blue >= 200 && colorSensor.green >= 200)
            x ++
    }
    override fun periodic() {
        super.periodic()
    }
}