
# MLTextExtractor Android App

MLTextExtractor is an Android application that leverages Google's ML Kit to extract text from images, providing users with a powerful tool for effortlessly recognizing and manipulating textual content. The app offers a user-friendly interface and a seamless experience, allowing users to capture text from photos in seconds.

## Features

- **Image Text Recognition**: Utilizes ML Kit's TextRecognition API to process images captured through the device's camera.
- **Copy to Clipboard**: Enables users to copy the extracted text to the clipboard for quick and easy use in other applications.
- **Effortless Erase**: Provides a button to clear the extracted text, ensuring a clean slate for subsequent recognition.
- **Onboarding Tutorial**: Includes an onboarding tutorial that introduces users to the capabilities of the app, making the learning curve smooth and enjoyable.

## Screenshots
![onboard2](https://github.com/mukesh-32/MLExtractText/assets/156600520/2e93fb03-213a-4203-b66b-9587af103b39)
![scanlogo](https://github.com/mukesh-32/MLExtractText/assets/156600520/f616523f-90bd-43eb-a639-9e0a43d5885e)
![onboard1](https://github.com/mukesh-32/MLExtractText/assets/156600520/6100454a-a7ad-4e4d-9da1-99888d95319b)

## Getting Started

To get started with MLTextExtractor, follow these simple steps:

1. Capture an image using the in-app camera feature.
2. Let the ML Kit process the image to recognize text.
3. Explore the extracted text and copy it to the clipboard.
4. Enjoy a seamless experience of ML-powered text recognition!

## Usage Example

```kotlin
// Sample code snippet demonstrating how to initiate text recognition
val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
val image = InputImage.fromBitmap(bitmap, 0)

val result = recognizer.process(image)
    .addOnSuccessListener { visionText ->
        // Task completed successfully
        result.setText(visionText.text.toString())
    }
    .addOnFailureListener { e ->
        // Task failed with an exception
        Toast.makeText(this, "Oops! Something went wrong", Toast.LENGTH_SHORT).show()
    }
```

## Build and Run

1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or device.

## Contributing

Contributions are welcome! Feel free to submit issues and pull requests to help enhance and improve the MLTextExtractor app.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- Thanks to the Google ML Kit for providing powerful text recognition capabilities.

Download MLTextExtractor now and explore the potential of ML-powered text recognition on Android!
