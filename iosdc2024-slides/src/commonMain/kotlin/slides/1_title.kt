package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import iosdc2024_slides.generated.resources.Res
import iosdc2024_slides.generated.resources.avatar
import iosdc2024_slides.generated.resources.cup
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled
import org.jetbrains.compose.resources.painterResource
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m2.TextWithPlatformEmoji
import org.kodein.emoji.smileys_emotion.face_smiling.Wink

val title by Slide {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "InputMethodKitとTCAを使ったmacOS上で動作するIMEの開発",
            style = MaterialTheme.typography.h1
        )
        Spacer(modifier = Modifier.size(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Tatsumi0000",
                style = MaterialTheme.typography.h2
            )
            Image(
                painterResource(Res.drawable.avatar),
                contentDescription = "Compose ur Pres",
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
            )
        }
    }
}